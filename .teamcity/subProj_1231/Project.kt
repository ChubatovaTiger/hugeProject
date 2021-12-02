package subProj_1231

import subProj_1231.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1231")
    name = "subProj 1231"

    buildType(subProj_bt_1231_3)
    buildType(subProj_bt_1231_4)
    buildType(subProj_bt_1231_5)
    buildType(subProj_bt_1231_0)
    buildType(subProj_bt_1231_1)
    buildType(subProj_bt_1231_2)
})
