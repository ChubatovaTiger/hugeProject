package subProj_1859

import subProj_1859.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1859")
    name = "subProj 1859"

    buildType(subProj_bt_1859_5)
    buildType(subProj_bt_1859_3)
    buildType(subProj_bt_1859_4)
    buildType(subProj_bt_1859_1)
    buildType(subProj_bt_1859_2)
    buildType(subProj_bt_1859_0)
})
