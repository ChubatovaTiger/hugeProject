package subProj_61

import subProj_61.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_61")
    name = "subProj 61"

    buildType(subProj_bt_61_0)
    buildType(subProj_bt_61_2)
    buildType(subProj_bt_61_1)
    buildType(subProj_bt_61_4)
    buildType(subProj_bt_61_3)
    buildType(subProj_bt_61_5)
})
