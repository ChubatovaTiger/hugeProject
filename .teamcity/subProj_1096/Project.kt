package subProj_1096

import subProj_1096.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1096")
    name = "subProj 1096"

    buildType(subProj_bt_1096_5)
    buildType(subProj_bt_1096_4)
    buildType(subProj_bt_1096_3)
    buildType(subProj_bt_1096_2)
    buildType(subProj_bt_1096_1)
    buildType(subProj_bt_1096_0)
})
