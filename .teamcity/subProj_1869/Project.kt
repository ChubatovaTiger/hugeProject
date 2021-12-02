package subProj_1869

import subProj_1869.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1869")
    name = "subProj 1869"

    buildType(subProj_bt_1869_4)
    buildType(subProj_bt_1869_5)
    buildType(subProj_bt_1869_2)
    buildType(subProj_bt_1869_3)
    buildType(subProj_bt_1869_0)
    buildType(subProj_bt_1869_1)
})
