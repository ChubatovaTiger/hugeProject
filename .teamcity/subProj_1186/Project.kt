package subProj_1186

import subProj_1186.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1186")
    name = "subProj 1186"

    buildType(subProj_bt_1186_4)
    buildType(subProj_bt_1186_5)
    buildType(subProj_bt_1186_0)
    buildType(subProj_bt_1186_1)
    buildType(subProj_bt_1186_2)
    buildType(subProj_bt_1186_3)
})
