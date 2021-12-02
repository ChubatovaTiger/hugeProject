package subProj_1590

import subProj_1590.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1590")
    name = "subProj 1590"

    buildType(subProj_bt_1590_4)
    buildType(subProj_bt_1590_3)
    buildType(subProj_bt_1590_5)
    buildType(subProj_bt_1590_0)
    buildType(subProj_bt_1590_2)
    buildType(subProj_bt_1590_1)
})
