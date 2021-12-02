package subProj_1443

import subProj_1443.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1443")
    name = "subProj 1443"

    buildType(subProj_bt_1443_5)
    buildType(subProj_bt_1443_4)
    buildType(subProj_bt_1443_1)
    buildType(subProj_bt_1443_0)
    buildType(subProj_bt_1443_3)
    buildType(subProj_bt_1443_2)
})
