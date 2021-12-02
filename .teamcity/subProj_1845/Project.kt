package subProj_1845

import subProj_1845.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1845")
    name = "subProj 1845"

    buildType(subProj_bt_1845_1)
    buildType(subProj_bt_1845_0)
    buildType(subProj_bt_1845_3)
    buildType(subProj_bt_1845_2)
    buildType(subProj_bt_1845_5)
    buildType(subProj_bt_1845_4)
})
