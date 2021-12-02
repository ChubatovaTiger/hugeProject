package subProj_1693

import subProj_1693.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1693")
    name = "subProj 1693"

    buildType(subProj_bt_1693_2)
    buildType(subProj_bt_1693_1)
    buildType(subProj_bt_1693_0)
    buildType(subProj_bt_1693_5)
    buildType(subProj_bt_1693_4)
    buildType(subProj_bt_1693_3)
})
