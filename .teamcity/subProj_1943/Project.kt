package subProj_1943

import subProj_1943.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1943")
    name = "subProj 1943"

    buildType(subProj_bt_1943_2)
    buildType(subProj_bt_1943_1)
    buildType(subProj_bt_1943_0)
    buildType(subProj_bt_1943_5)
    buildType(subProj_bt_1943_4)
    buildType(subProj_bt_1943_3)
})
