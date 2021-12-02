package subProj_1213

import subProj_1213.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1213")
    name = "subProj 1213"

    buildType(subProj_bt_1213_5)
    buildType(subProj_bt_1213_4)
    buildType(subProj_bt_1213_3)
    buildType(subProj_bt_1213_2)
    buildType(subProj_bt_1213_1)
    buildType(subProj_bt_1213_0)
})
