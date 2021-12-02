package subProj_278

import subProj_278.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_278")
    name = "subProj 278"

    buildType(subProj_bt_278_5)
    buildType(subProj_bt_278_4)
    buildType(subProj_bt_278_3)
    buildType(subProj_bt_278_2)
    buildType(subProj_bt_278_1)
    buildType(subProj_bt_278_0)
})
