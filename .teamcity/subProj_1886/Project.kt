package subProj_1886

import subProj_1886.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1886")
    name = "subProj 1886"

    buildType(subProj_bt_1886_4)
    buildType(subProj_bt_1886_3)
    buildType(subProj_bt_1886_2)
    buildType(subProj_bt_1886_1)
    buildType(subProj_bt_1886_0)
    buildType(subProj_bt_1886_5)
})
