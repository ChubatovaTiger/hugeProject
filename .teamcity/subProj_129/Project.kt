package subProj_129

import subProj_129.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_129")
    name = "subProj 129"

    buildType(subProj_bt_129_3)
    buildType(subProj_bt_129_2)
    buildType(subProj_bt_129_1)
    buildType(subProj_bt_129_0)
    buildType(subProj_bt_129_5)
    buildType(subProj_bt_129_4)
})
