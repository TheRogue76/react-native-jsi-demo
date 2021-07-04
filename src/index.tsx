import { NativeModules } from 'react-native';

type CalendarType = {
  helloWorld: () => void;
};

const { Calendar } = NativeModules;

export default Calendar as CalendarType;
