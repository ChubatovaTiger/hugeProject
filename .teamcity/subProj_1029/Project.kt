package subProj_1029

import subProj_1029.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1029")
    name = "subProj 1029"

    buildType(subProj_bt_1029_3)
    buildType(subProj_bt_1029_2)
    buildType(subProj_bt_1029_1)
    buildType(subProj_bt_1029_0)
    buildType(subProj_bt_1029_5)
    buildType(subProj_bt_1029_4)
})
