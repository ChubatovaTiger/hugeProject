package subProj_368

import subProj_368.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_368")
    name = "subProj 368"

    buildType(subProj_bt_368_4)
    buildType(subProj_bt_368_3)
    buildType(subProj_bt_368_5)
    buildType(subProj_bt_368_0)
    buildType(subProj_bt_368_2)
    buildType(subProj_bt_368_1)
})
