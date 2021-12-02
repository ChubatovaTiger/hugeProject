package subProj_980

import subProj_980.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_980")
    name = "subProj 980"

    buildType(subProj_bt_980_1)
    buildType(subProj_bt_980_2)
    buildType(subProj_bt_980_0)
    buildType(subProj_bt_980_5)
    buildType(subProj_bt_980_3)
    buildType(subProj_bt_980_4)
})
