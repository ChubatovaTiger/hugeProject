package subProj_1927

import subProj_1927.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1927")
    name = "subProj 1927"

    buildType(subProj_bt_1927_5)
    buildType(subProj_bt_1927_0)
    buildType(subProj_bt_1927_3)
    buildType(subProj_bt_1927_4)
    buildType(subProj_bt_1927_1)
    buildType(subProj_bt_1927_2)
})
