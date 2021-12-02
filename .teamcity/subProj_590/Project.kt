package subProj_590

import subProj_590.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_590")
    name = "subProj 590"

    buildType(subProj_bt_590_2)
    buildType(subProj_bt_590_3)
    buildType(subProj_bt_590_0)
    buildType(subProj_bt_590_1)
    buildType(subProj_bt_590_4)
    buildType(subProj_bt_590_5)
})
