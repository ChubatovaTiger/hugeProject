package subProj_1372

import subProj_1372.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1372")
    name = "subProj 1372"

    buildType(subProj_bt_1372_5)
    buildType(subProj_bt_1372_0)
    buildType(subProj_bt_1372_1)
    buildType(subProj_bt_1372_2)
    buildType(subProj_bt_1372_3)
    buildType(subProj_bt_1372_4)
})
