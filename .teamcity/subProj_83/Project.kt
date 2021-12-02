package subProj_83

import subProj_83.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_83")
    name = "subProj 83"

    buildType(subProj_bt_83_1)
    buildType(subProj_bt_83_2)
    buildType(subProj_bt_83_0)
    buildType(subProj_bt_83_5)
    buildType(subProj_bt_83_3)
    buildType(subProj_bt_83_4)
})
