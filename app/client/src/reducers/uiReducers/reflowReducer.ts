import { createReducer } from "utils/ReducerUtils";
import type { ReduxAction } from "ee/constants/ReduxActionConstants";
import { ReflowReduxActionTypes } from "ee/constants/ReduxActionConstants";
import type { ReflowedSpaceMap } from "reflow/reflowTypes";

const initialState: widgetReflow = {
  isReflowing: false,
  reflowingWidgets: {},
};

export const widgetReflowReducer = createReducer(initialState, {
  [ReflowReduxActionTypes.STOP_REFLOW]: () => {
    return {
      isReflowing: false,
    };
  },
  [ReflowReduxActionTypes.REFLOW_MOVE]: (
    state: widgetReflow,
    action: ReduxAction<{ reflowingWidgets: ReflowedSpaceMap }>,
  ) => {
    return {
      isReflowing: true,
      reflowingWidgets: { ...action.payload },
    };
  },
});

export interface widgetReflow {
  isReflowing: boolean;
  reflowingWidgets: ReflowedSpaceMap;
}
