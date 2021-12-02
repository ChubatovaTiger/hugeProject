package subProj_1936

import subProj_1936.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1936")
    name = "subProj 1936"

    buildType(subProj_bt_1936_2)
    buildType(subProj_bt_1936_1)
    buildType(subProj_bt_1936_0)
    buildType(subProj_bt_1936_5)
    buildType(subProj_bt_1936_4)
    buildType(subProj_bt_1936_3)
})
