package subProj_213

import subProj_213.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_213")
    name = "subProj 213"

    buildType(subProj_bt_213_4)
    buildType(subProj_bt_213_5)
    buildType(subProj_bt_213_0)
    buildType(subProj_bt_213_1)
    buildType(subProj_bt_213_2)
    buildType(subProj_bt_213_3)
})
