package subProj_1958

import subProj_1958.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1958")
    name = "subProj 1958"

    buildType(subProj_bt_1958_3)
    buildType(subProj_bt_1958_4)
    buildType(subProj_bt_1958_5)
    buildType(subProj_bt_1958_0)
    buildType(subProj_bt_1958_1)
    buildType(subProj_bt_1958_2)
})
