package subProj_936

import subProj_936.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_936")
    name = "subProj 936"

    buildType(subProj_bt_936_0)
    buildType(subProj_bt_936_1)
    buildType(subProj_bt_936_2)
    buildType(subProj_bt_936_3)
    buildType(subProj_bt_936_4)
    buildType(subProj_bt_936_5)
})
