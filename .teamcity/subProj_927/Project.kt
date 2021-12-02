package subProj_927

import subProj_927.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_927")
    name = "subProj 927"

    buildType(subProj_bt_927_5)
    buildType(subProj_bt_927_4)
    buildType(subProj_bt_927_3)
    buildType(subProj_bt_927_2)
    buildType(subProj_bt_927_1)
    buildType(subProj_bt_927_0)
})
