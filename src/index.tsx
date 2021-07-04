import { NativeModules } from 'react-native';

type CalendarType = {
  helloWorld: () => string;
};

const { Calendar } = NativeModules;

export default Calendar as CalendarType;
