package subProj_89

import subProj_89.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_89")
    name = "subProj 89"

    buildType(subProj_bt_89_0)
    buildType(subProj_bt_89_4)
    buildType(subProj_bt_89_3)
    buildType(subProj_bt_89_2)
    buildType(subProj_bt_89_1)
    buildType(subProj_bt_89_5)
})
