package subProj_413

import subProj_413.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_413")
    name = "subProj 413"

    buildType(subProj_bt_413_0)
    buildType(subProj_bt_413_1)
    buildType(subProj_bt_413_2)
    buildType(subProj_bt_413_3)
    buildType(subProj_bt_413_4)
    buildType(subProj_bt_413_5)
})
