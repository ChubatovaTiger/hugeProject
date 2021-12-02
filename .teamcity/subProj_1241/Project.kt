package subProj_1241

import subProj_1241.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1241")
    name = "subProj 1241"

    buildType(subProj_bt_1241_4)
    buildType(subProj_bt_1241_5)
    buildType(subProj_bt_1241_0)
    buildType(subProj_bt_1241_1)
    buildType(subProj_bt_1241_2)
    buildType(subProj_bt_1241_3)
})
