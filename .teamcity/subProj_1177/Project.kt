package subProj_1177

import subProj_1177.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1177")
    name = "subProj 1177"

    buildType(subProj_bt_1177_2)
    buildType(subProj_bt_1177_3)
    buildType(subProj_bt_1177_4)
    buildType(subProj_bt_1177_5)
    buildType(subProj_bt_1177_0)
    buildType(subProj_bt_1177_1)
})
