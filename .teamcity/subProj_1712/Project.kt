package subProj_1712

import subProj_1712.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1712")
    name = "subProj 1712"

    buildType(subProj_bt_1712_1)
    buildType(subProj_bt_1712_2)
    buildType(subProj_bt_1712_0)
    buildType(subProj_bt_1712_5)
    buildType(subProj_bt_1712_3)
    buildType(subProj_bt_1712_4)
})
