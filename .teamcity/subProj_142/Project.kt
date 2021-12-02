package subProj_142

import subProj_142.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_142")
    name = "subProj 142"

    buildType(subProj_bt_142_5)
    buildType(subProj_bt_142_4)
    buildType(subProj_bt_142_3)
    buildType(subProj_bt_142_2)
    buildType(subProj_bt_142_1)
    buildType(subProj_bt_142_0)
})
