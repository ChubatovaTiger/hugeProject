package subProj_1668

import subProj_1668.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1668")
    name = "subProj 1668"

    buildType(subProj_bt_1668_5)
    buildType(subProj_bt_1668_3)
    buildType(subProj_bt_1668_4)
    buildType(subProj_bt_1668_1)
    buildType(subProj_bt_1668_2)
    buildType(subProj_bt_1668_0)
})
