package subProj_453

import subProj_453.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_453")
    name = "subProj 453"

    buildType(subProj_bt_453_4)
    buildType(subProj_bt_453_5)
    buildType(subProj_bt_453_2)
    buildType(subProj_bt_453_3)
    buildType(subProj_bt_453_0)
    buildType(subProj_bt_453_1)
})
