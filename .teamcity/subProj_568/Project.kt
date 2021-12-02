package subProj_568

import subProj_568.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_568")
    name = "subProj 568"

    buildType(subProj_bt_568_0)
    buildType(subProj_bt_568_2)
    buildType(subProj_bt_568_1)
    buildType(subProj_bt_568_4)
    buildType(subProj_bt_568_3)
    buildType(subProj_bt_568_5)
})
