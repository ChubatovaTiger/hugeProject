package subProj_1938

import subProj_1938.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1938")
    name = "subProj 1938"

    buildType(subProj_bt_1938_5)
    buildType(subProj_bt_1938_0)
    buildType(subProj_bt_1938_4)
    buildType(subProj_bt_1938_3)
    buildType(subProj_bt_1938_2)
    buildType(subProj_bt_1938_1)
})
