package subProj_860

import subProj_860.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_860")
    name = "subProj 860"

    buildType(subProj_bt_860_1)
    buildType(subProj_bt_860_0)
    buildType(subProj_bt_860_5)
    buildType(subProj_bt_860_4)
    buildType(subProj_bt_860_3)
    buildType(subProj_bt_860_2)
})
