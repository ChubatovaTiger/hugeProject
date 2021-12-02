package subProj_831

import subProj_831.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_831")
    name = "subProj 831"

    buildType(subProj_bt_831_0)
    buildType(subProj_bt_831_1)
    buildType(subProj_bt_831_4)
    buildType(subProj_bt_831_5)
    buildType(subProj_bt_831_2)
    buildType(subProj_bt_831_3)
})
