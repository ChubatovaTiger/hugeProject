package subProj_1033

import subProj_1033.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1033")
    name = "subProj 1033"

    buildType(subProj_bt_1033_3)
    buildType(subProj_bt_1033_4)
    buildType(subProj_bt_1033_5)
    buildType(subProj_bt_1033_0)
    buildType(subProj_bt_1033_1)
    buildType(subProj_bt_1033_2)
})
