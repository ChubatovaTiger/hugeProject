package subProj_148

import subProj_148.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_148")
    name = "subProj 148"

    buildType(subProj_bt_148_5)
    buildType(subProj_bt_148_4)
    buildType(subProj_bt_148_3)
    buildType(subProj_bt_148_2)
    buildType(subProj_bt_148_1)
    buildType(subProj_bt_148_0)
})
