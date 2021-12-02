package subProj_231

import subProj_231.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_231")
    name = "subProj 231"

    buildType(subProj_bt_231_5)
    buildType(subProj_bt_231_4)
    buildType(subProj_bt_231_1)
    buildType(subProj_bt_231_0)
    buildType(subProj_bt_231_3)
    buildType(subProj_bt_231_2)
})
