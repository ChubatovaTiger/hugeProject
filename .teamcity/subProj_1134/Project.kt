package subProj_1134

import subProj_1134.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1134")
    name = "subProj 1134"

    buildType(subProj_bt_1134_3)
    buildType(subProj_bt_1134_4)
    buildType(subProj_bt_1134_1)
    buildType(subProj_bt_1134_2)
    buildType(subProj_bt_1134_5)
    buildType(subProj_bt_1134_0)
})
