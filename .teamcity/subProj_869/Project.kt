package subProj_869

import subProj_869.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_869")
    name = "subProj 869"

    buildType(subProj_bt_869_4)
    buildType(subProj_bt_869_3)
    buildType(subProj_bt_869_2)
    buildType(subProj_bt_869_1)
    buildType(subProj_bt_869_5)
    buildType(subProj_bt_869_0)
})
