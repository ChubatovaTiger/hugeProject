package subProj_1352

import subProj_1352.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1352")
    name = "subProj 1352"

    buildType(subProj_bt_1352_2)
    buildType(subProj_bt_1352_1)
    buildType(subProj_bt_1352_0)
    buildType(subProj_bt_1352_5)
    buildType(subProj_bt_1352_4)
    buildType(subProj_bt_1352_3)
})
