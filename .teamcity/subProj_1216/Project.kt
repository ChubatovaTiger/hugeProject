package subProj_1216

import subProj_1216.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1216")
    name = "subProj 1216"

    buildType(subProj_bt_1216_5)
    buildType(subProj_bt_1216_4)
    buildType(subProj_bt_1216_3)
    buildType(subProj_bt_1216_2)
    buildType(subProj_bt_1216_1)
    buildType(subProj_bt_1216_0)
})
