package subProj_1413

import subProj_1413.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1413")
    name = "subProj 1413"

    buildType(subProj_bt_1413_5)
    buildType(subProj_bt_1413_0)
    buildType(subProj_bt_1413_4)
    buildType(subProj_bt_1413_3)
    buildType(subProj_bt_1413_2)
    buildType(subProj_bt_1413_1)
})
