package subProj_922

import subProj_922.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_922")
    name = "subProj 922"

    buildType(subProj_bt_922_2)
    buildType(subProj_bt_922_1)
    buildType(subProj_bt_922_0)
    buildType(subProj_bt_922_5)
    buildType(subProj_bt_922_4)
    buildType(subProj_bt_922_3)
})
