package subProj_162

import subProj_162.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_162")
    name = "subProj 162"

    buildType(subProj_bt_162_0)
    buildType(subProj_bt_162_1)
    buildType(subProj_bt_162_2)
    buildType(subProj_bt_162_3)
    buildType(subProj_bt_162_4)
    buildType(subProj_bt_162_5)
})
