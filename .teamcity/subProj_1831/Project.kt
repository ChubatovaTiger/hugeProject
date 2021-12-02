package subProj_1831

import subProj_1831.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1831")
    name = "subProj 1831"

    buildType(subProj_bt_1831_1)
    buildType(subProj_bt_1831_2)
    buildType(subProj_bt_1831_3)
    buildType(subProj_bt_1831_4)
    buildType(subProj_bt_1831_0)
    buildType(subProj_bt_1831_5)
})
