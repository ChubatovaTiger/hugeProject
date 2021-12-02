package subProj_1697

import subProj_1697.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1697")
    name = "subProj 1697"

    buildType(subProj_bt_1697_2)
    buildType(subProj_bt_1697_1)
    buildType(subProj_bt_1697_0)
    buildType(subProj_bt_1697_5)
    buildType(subProj_bt_1697_4)
    buildType(subProj_bt_1697_3)
})
