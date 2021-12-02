package subProj_1044

import subProj_1044.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1044")
    name = "subProj 1044"

    buildType(subProj_bt_1044_3)
    buildType(subProj_bt_1044_4)
    buildType(subProj_bt_1044_5)
    buildType(subProj_bt_1044_0)
    buildType(subProj_bt_1044_1)
    buildType(subProj_bt_1044_2)
})
